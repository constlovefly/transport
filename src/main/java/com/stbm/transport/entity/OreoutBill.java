package com.stbm.transport.entity;

import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.experimental.Accessors;

@Getter
@Setter
@ToString
@Accessors(chain = true)
@Table(name = "`oreout_bill_table`")
public class OreoutBill {
    @Id
    @Column(name = "`id`")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "select replace(uuid(),-,') AS id")
    private String id;

    /**
     * 车牌号
     */
    @Column(name = "`plate_num`")
    private String plateNum;

    /**
     * 煤矿
     */
    @Column(name = "`ore_name`")
    private String oreName;

    /**
     * 煤种
     */
    @Column(name = "`coal_type`")
    private String coalType;

    /**
     * 提煤单号
     */
    @Column(name = "`extract_num`")
    private String extractNum;

    /**
     * 矿发磅单号
     */
    @Column(name = "`pound_num`")
    private String poundNum;

    /**
     * 总重
     */
    @Column(name = "`total_weight`")
    private Double totalWeight;

    /**
     * 皮重
     */
    @Column(name = "`tare_weight`")
    private Double tareWeight;

    /**
     * 净重
     */
    @Column(name = "`net_weight`")
    private Double netWeight;

    /**
     * 矿发时间
     */
    @Column(name = "`bill_time`")
    private String billTime;

    /**
     * 收货单位
     */
    @Column(name = "`take_company`")
    private String takeCompany;

    /**
     * 车辆状态
     */
    @Column(name = "`car_state`")
    private String carState;

    @Column(name = "`remark`")
    private String remark;
}