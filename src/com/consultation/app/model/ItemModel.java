package com.consultation.app.model;

import java.util.List;

public class ItemModel {

    private String id="0";

    private String name="";

    private String firstStr="";

    private String lastStr="";

    private String level="";

    private String type="";

    private String input="";

    private String childCount="0";

    private String value="";

    private String dataType="";

    private String isShow="True";

    private String prefixP="";

    private String suffixP="";

    private String seperator="";

    private String noChecked="";

    public String getPrefixP() {
        return prefixP;
    }

    public void setPrefixP(String prefixP) {
        this.prefixP=prefixP;
    }

    public String getSuffixP() {
        return suffixP;
    }

    public void setSuffixP(String suffixP) {
        this.suffixP=suffixP;
    }

    public String getSeperator() {
        return seperator;
    }

    public void setSeperator(String seperator) {
        this.seperator=seperator;
    }

    public String getNoChecked() {
        return noChecked;
    }

    public void setNoChecked(String noChecked) {
        this.noChecked=noChecked;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow=isShow;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType=dataType;
    }

    private List<OptionsModel> optionsModels;

    private List<ItemModel> itemModels;

    public String getChildCount() {
        return childCount;
    }

    public void setChildCount(String childCount) {
        this.childCount=childCount;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value=value;
    }

    public List<ItemModel> getItemModels() {
        return itemModels;
    }

    public void setItemModels(List<ItemModel> itemModels) {
        this.itemModels=itemModels;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getFirstStr() {
        return firstStr;
    }

    public void setFirstStr(String firstStr) {
        this.firstStr=firstStr;
    }

    public String getLastStr() {
        return lastStr;
    }

    public void setLastStr(String lastStr) {
        this.lastStr=lastStr;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level=level;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type=type;
    }

    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input=input;
    }

    public List<OptionsModel> getOptionsModels() {
        return optionsModels;
    }

    public void setOptionsModels(List<OptionsModel> optionsModels) {
        this.optionsModels=optionsModels;
    }

    public ItemModel() {
        super();
    }

    public ItemModel(String id, String name, String firstStr, String lastStr, String level, String type, String input,
        List<OptionsModel> optionsModels, List<ItemModel> itemModels) {
        super();
        this.id=id;
        this.name=name;
        this.firstStr=firstStr;
        this.lastStr=lastStr;
        this.level=level;
        this.type=type;
        this.input=input;
        this.optionsModels=optionsModels;
        this.itemModels=itemModels;
    }

}
