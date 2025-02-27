package com.entity.vo;

import com.entity.TechanEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 特产
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email
 * @date 2021-05-07
 */
@TableName("techan")
public class TechanVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 特产名称
     */

    @TableField(value = "techan_name")
    private String techanName;


    /**
     * 特产类型
     */

    @TableField(value = "techan_types")
    private Integer techanTypes;


    /**
     * 特产图片
     */

    @TableField(value = "techan_photo")
    private String techanPhoto;


    /**
     * 单价
     */

    @TableField(value = "techan_new_money")
    private Double techanNewMoney;


    /**
     * 特产详情
     */

    @TableField(value = "techan_content")
    private String techanContent;


    /**
     * 创建时间  show1  show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：特产名称
	 */
    public String getTechanName() {
        return techanName;
    }


    /**
	 * 获取：特产名称
	 */

    public void setTechanName(String techanName) {
        this.techanName = techanName;
    }
    /**
	 * 设置：特产类型
	 */
    public Integer getTechanTypes() {
        return techanTypes;
    }


    /**
	 * 获取：特产类型
	 */

    public void setTechanTypes(Integer techanTypes) {
        this.techanTypes = techanTypes;
    }
    /**
	 * 设置：特产图片
	 */
    public String getTechanPhoto() {
        return techanPhoto;
    }


    /**
	 * 获取：特产图片
	 */

    public void setTechanPhoto(String techanPhoto) {
        this.techanPhoto = techanPhoto;
    }
    /**
	 * 设置：单价
	 */
    public Double getTechanNewMoney() {
        return techanNewMoney;
    }


    /**
	 * 获取：单价
	 */

    public void setTechanNewMoney(Double techanNewMoney) {
        this.techanNewMoney = techanNewMoney;
    }
    /**
	 * 设置：特产详情
	 */
    public String getTechanContent() {
        return techanContent;
    }


    /**
	 * 获取：特产详情
	 */

    public void setTechanContent(String techanContent) {
        this.techanContent = techanContent;
    }
    /**
	 * 设置：创建时间  show1  show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间  show1  show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
