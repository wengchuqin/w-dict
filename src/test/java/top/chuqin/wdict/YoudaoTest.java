package top.chuqin.wdict;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.junit.Test;
import top.chuqin.wdict.domian.dataobject.TranslateResult;

public class YoudaoTest {
    String appKey = "4c41d30589a6f769";
    String appSecret = "NmqUoQN03LYhV9Syiaix0L3fRalXj6vB";


    @Test
    public void testZhToEn() throws Exception {
        String query = "你好";
        String salt = String.valueOf(System.currentTimeMillis());
        String from = "zh-CHS";
        String to = "EN";
        String sign = md5(appKey + query + salt + appSecret);
        Map<String, String> params = new HashMap();
        params.put("q", query);
        params.put("from", from);
        params.put("to", to);
        params.put("sign", sign);
        params.put("salt", salt);
        params.put("appKey", appKey);
        System.out.println(requestForHttp("http://openapi.youdao.com/api", params));

        TranslateResult translateResult = JSON.parseObject(requestForHttp("http://openapi.youdao.com/api", params), TranslateResult.class);
        System.out.println(translateResult);
    }

    @Test
    public void testEnToCh() throws Exception {
        String query = "hello";
        String salt = String.valueOf(System.currentTimeMillis());
        String from = "EN";
        String to = "zh-CHS";
        String sign = md5(appKey + query + salt + appSecret);
        Map<String, String> params = new HashMap();
        params.put("q", query);
        params.put("from", from);
        params.put("to", to);
        params.put("sign", sign);
        params.put("salt", salt);
        params.put("appKey", appKey);
        System.out.println(requestForHttp("http://openapi.youdao.com/api", params));

        TranslateResult translateResult = JSON.parseObject(requestForHttp("http://openapi.youdao.com/api", params), TranslateResult.class);
        System.out.println(translateResult);
    }


    public String requestForHttp(String url, Map requestParams) throws Exception {
        String result = null;
        CloseableHttpClient httpClient = HttpClients.createDefault();
        /**HttpPost*/
        HttpPost httpPost = new HttpPost(url);
        System.out.println(new JSONObject(requestParams).toString());
        List<BasicNameValuePair> params = new ArrayList();
        Iterator<Entry<String, String>> it = requestParams.entrySet().iterator();
        while (it.hasNext()) {
            Entry<String, String> en = it.next();
            String key = en.getKey();
            String value = en.getValue();
            if (value != null) {
                params.add(new BasicNameValuePair(key, value));
            }
        }
        httpPost.setEntity(new UrlEncodedFormEntity(params, "UTF-8"));
        /**HttpResponse*/
        CloseableHttpResponse httpResponse = httpClient.execute(httpPost);
        try {
            HttpEntity httpEntity = httpResponse.getEntity();
            result = EntityUtils.toString(httpEntity, "utf-8");
            EntityUtils.consume(httpEntity);
        } finally {
            try {
                if (httpResponse != null) {
                    httpResponse.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 生成32位MD5摘要
     *
     * @param string
     * @return
     */
    public String md5(String string) {
        if (string == null) {
            return null;
        }
        char hexDigits[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
                'A', 'B', 'C', 'D', 'E', 'F'};

        try {
            byte[] btInput = string.getBytes("utf-8");
            /** 获得MD5摘要算法的 MessageDigest 对象 */
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            /** 使用指定的字节更新摘要 */
            mdInst.update(btInput);
            /** 获得密文 */
            byte[] md = mdInst.digest();
            /** 把密文转换成十六进制的字符串形式 */
            int j = md.length;
            char str[] = new char[j * 2];
            int k = 0;
            for (byte byte0 : md) {
                str[k++] = hexDigits[byte0 >>> 4 & 0xf];
                str[k++] = hexDigits[byte0 & 0xf];
            }
            return new String(str);
        } catch (NoSuchAlgorithmException | UnsupportedEncodingException e) {
            return null;
        }
    }
}
