package com.example.store.model.shiro;

/**
 * 权限设计
 * 
 * @author 26500
 *
 */
public enum ShiroEnum {

    AVAILABLE("正常状态", 1),FREEZE("冻结状态",2);

    private String name;
    private Integer index;

    private ShiroEnum(String name, Integer index) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }


}
