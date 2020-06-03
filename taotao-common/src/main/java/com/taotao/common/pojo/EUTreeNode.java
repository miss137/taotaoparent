package com.taotao.common.pojo;

/**
 *easyUI树形控件节点格式
 */
public class EUTreeNode {

    private  long  id;
    private String text;
    private String status;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
