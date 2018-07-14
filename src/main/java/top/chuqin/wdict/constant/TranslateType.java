package top.chuqin.wdict.constant;

public enum  TranslateType {
    EN2ZH("EN2zh-CHS"),
    ZH2EN("zh-CHS2EN");

    private String type;

    TranslateType(String type) {
        this.type = type;
    }

    public static TranslateType fromType(String type){
        for(TranslateType translateType : TranslateType.values()){
            if(translateType.type.equals(type)){
                return translateType;
            }
        }
        throw new RuntimeException(String.format("找不到type为'%s'的enum", type));
    }
}
