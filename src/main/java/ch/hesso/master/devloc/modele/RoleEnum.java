package ch.hesso.master.devloc.modele;

public enum RoleEnum {
    OWNER("OWNER"),
    EDITOR("EDITOR"),
    VIEWER("VIEWER");

    private String code;

    RoleEnum(){}

    RoleEnum(String code){
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
}
