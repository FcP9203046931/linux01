package com.linux.command.po;

import java.util.Date;

/**
 * @Auther: fengchunping
 * @Date: 2019/3/19 14:22
 * @Description: 表共有属性类，所有的po类都继承与他
 */
public class BassPo {

    /**
     *
     * 功能描述:
     *
     * @param: 主键id
     * @return:
     * @date: 2019/3/19 14:14
     */
    private Integer id;

    /**
     *
     * 功能描述:
     *
     * @param: 状态
     * @return:
     * @auther:
     * @date: 2019/3/19 14:17
     */
    private int status;

    /**
     *
     * 功能描述:
     *
     * @param: 创建时间
     * @return:
     * @auther:
     * @date: 2019/3/19 14:17
     */
    private Date createDt;

    /**
     *
     * 功能描述:
     *
     * @param: 修改时间
     * @return:
     * @auther:
     * @date: 2019/3/19 14:17
     */
    private Date modifiedTime;

}
