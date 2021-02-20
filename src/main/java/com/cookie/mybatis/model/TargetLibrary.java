package com.cookie.mybatis.model;

import lombok.Data;

import java.util.Date;
public class TargetLibrary {
    /**
     * 自增主键
     */
    private Long infoTargetLibraryId;

    /**
     * 目标库ID
     */


    private Long targetLibId;

    /**
     * 目标库导入类型，ISMS代表ISMS导入，WEB代表页面导入，GLOBAL代表全局导入（可以继续扩展）
     */
    private String targetLibImportType;

    /**
     * 特征库ID(底层平台返回)
     */
    private String featureDbId;

    /**
     * 人像库名称
     */
    private String name;

    /**
     * 人像库类型0:白名单 1:黑名单 2:灰名单 3:红名单
     */
    private Integer type;

    /**
     * 人像库描述
     */
    private String description;

    /**
     * 状态:默认状态为0，已删除，1为正常
     */
    private Integer status;

    /**
     * 创建人
     */
    private Long creator;

    /**
     * 账号
     */
    private String username;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 创建时间- YYYY-MM-DD hh:mm:ss
     */
    private Date createTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 获取自增主键
     *
     * @return info_target_library_id - 自增主键
     */
    public Long getInfoTargetLibraryId() {
        return infoTargetLibraryId;
    }

    /**
     * 设置自增主键
     *
     * @param infoTargetLibraryId 自增主键
     */
    public void setInfoTargetLibraryId(Long infoTargetLibraryId) {
        this.infoTargetLibraryId = infoTargetLibraryId;
    }

    /**
     * 获取目标库ID
     *
     * @return target_lib_id - 目标库ID
     */
    public Long getTargetLibId() {
        return targetLibId;
    }

    /**
     * 设置目标库ID
     *
     * @param targetLibId 目标库ID
     */
    public void setTargetLibId(Long targetLibId) {
        this.targetLibId = targetLibId;
    }

    /**
     * 获取目标库导入类型，ISMS代表ISMS导入，WEB代表页面导入，GLOBAL代表全局导入（可以继续扩展）
     *
     * @return target_lib_import_type - 目标库导入类型，ISMS代表ISMS导入，WEB代表页面导入，GLOBAL代表全局导入（可以继续扩展）
     */
    public String getTargetLibImportType() {
        return targetLibImportType;
    }

    /**
     * 设置目标库导入类型，ISMS代表ISMS导入，WEB代表页面导入，GLOBAL代表全局导入（可以继续扩展）
     *
     * @param targetLibImportType 目标库导入类型，ISMS代表ISMS导入，WEB代表页面导入，GLOBAL代表全局导入（可以继续扩展）
     */
    public void setTargetLibImportType(String targetLibImportType) {
        this.targetLibImportType = targetLibImportType == null ? null : targetLibImportType.trim();
    }

    /**
     * 获取特征库ID(底层平台返回)
     *
     * @return feature_db_id - 特征库ID(底层平台返回)
     */
    public String getFeatureDbId() {
        return featureDbId;
    }

    /**
     * 设置特征库ID(底层平台返回)
     *
     * @param featureDbId 特征库ID(底层平台返回)
     */
    public void setFeatureDbId(String featureDbId) {
        this.featureDbId = featureDbId == null ? null : featureDbId.trim();
    }

    /**
     * 获取人像库名称
     *
     * @return name - 人像库名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置人像库名称
     *
     * @param name 人像库名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取人像库类型0:白名单 1:黑名单 2:灰名单 3:红名单
     *
     * @return type - 人像库类型0:白名单 1:黑名单 2:灰名单 3:红名单
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置人像库类型0:白名单 1:黑名单 2:灰名单 3:红名单
     *
     * @param type 人像库类型0:白名单 1:黑名单 2:灰名单 3:红名单
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * 获取人像库描述
     *
     * @return description - 人像库描述
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置人像库描述
     *
     * @param description 人像库描述
     */
    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    /**
     * 获取状态:默认状态为0，已删除，1为正常
     *
     * @return status - 状态:默认状态为0，已删除，1为正常
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态:默认状态为0，已删除，1为正常
     *
     * @param status 状态:默认状态为0，已删除，1为正常
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取创建人
     *
     * @return creator - 创建人
     */
    public Long getCreator() {
        return creator;
    }

    /**
     * 设置创建人
     *
     * @param creator 创建人
     */
    public void setCreator(Long creator) {
        this.creator = creator;
    }

    /**
     * 获取账号
     *
     * @return username - 账号
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置账号
     *
     * @param username 账号
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    /**
     * 获取创建时间- YYYY-MM-DD hh:mm:ss
     *
     * @return create_time - 创建时间- YYYY-MM-DD hh:mm:ss
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间- YYYY-MM-DD hh:mm:ss
     *
     * @param createTime 创建时间- YYYY-MM-DD hh:mm:ss
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}