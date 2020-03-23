package jpa;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "tb_customer")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class TbCustomer extends BaseEntityWithUser{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name="cus_tp", nullable = false)
    private String cusTp;

    @Column(name="cus_st", nullable = false)
    private String cusSt;

    @Column(name="grp_cd", nullable = false)
    private String grpCd;

    @Column(name="mem_cd", nullable = false)
    private Long memCd;

    @Column(name="cus_barcode", nullable = false)
    private String cusBarcode;

    @Column(name="cus_email")
    private String cusEmail;

    @Column(name="cus_login_pw", nullable = false)
    private String cusLoginPw;

    @Column(name="cus_nickname", nullable = false)
    private String cusNickname;

    @Column(name="cus_name")
    private String cusName;

    @Column(name="cus_ci")
    private String cusCi;

    @Column(name="cus_di")
    private String cusDi;

    @Column(name="cus_birthday")
    private String cusBirthday;

    @Column(name="cus_gender")
    private String cusGender;

    @Column(name="cus_mobile_no", nullable = false)
    private String cusMobileNo;

    @Column(name="cus_mobile_no_bk", nullable = false)
    private String cusMobileNoBk;

    @Column(name="cus_level", nullable = false)
    private String cusLevel;

    @Column(name="cus_level_dt")
    private LocalDate cusLevelDt;

    @Column(name="cus_level_stamp", nullable = false)
    private Integer cusLevelStamp = 0;

    @Column(name="login_fail_cnt", nullable = false)
    private Integer loginFailCnt = 0;

    @Column(name="cus_stamp_sum", nullable = false)
    private Integer cusStampSum = 0;

    @Column(name="cus_coupon_sum", nullable = false)
    private Integer cusCouponSum = 0;

    @Column(name="cus_stamp_cnt", nullable = false)
    private Integer cusStampCnt = 0;

    @Column(name="cus_coupon_cnt", nullable = false)
    private Integer cusCouponCnt = 0;

    @Column(name="cus_stamp_change_cnt", nullable = false)
    private Integer cusStampChangeCnt = 0;

    @Column(name="cash_receipt_tp", nullable = false)
    private String cashReceiptTp;

    @Column(name="cash_receipt_no")
    private String cashReceiptNo;

    @Column(name="last_active_dt", nullable = false)
    private LocalDate lastActiveDt = LocalDate.now();

    @Column(name="noti_active_dt", nullable = false)
    private LocalDate notiActiveDt = LocalDate.now();



//    @OneToMany(mappedBy = "tbCustomer")
//    private List<TbSvcSale> tbSvcSale = new ArrayList<>();

//    @OneToMany(mappedBy = "tbCustomer")
//    private List<TbSvcCustomerStamp> tbSvcCustomerStamp = new ArrayList<>();

    public TbCustomer(Long id){
        this.id = id;
    }
    @Builder
    public TbCustomer(String cusTp, String cusSt, String grpCd, Long memCd, String cusBarcode, String cusEmail, String cusLoginPw, String cusNickname, String cusName, String cusCi, String cusDi, String cusBirthday, String cusGender, String cusMobileNo, String cusMobileNoBk, String cusLevel, LocalDate cusLevelDt, Integer cusLevelStamp, Integer loginFailCnt, Integer cusStampSum, Integer cusCouponSum, Integer cusStampCnt, Integer cusCouponCnt, Integer cusStampChangeCnt, String cashReceiptTp, String cashReceiptNo, LocalDate lastActiveDt, LocalDate notiActiveDt, String userId) {
        this.cusTp = cusTp;
        this.cusSt = cusSt;
        this.grpCd = grpCd;
        this.memCd = memCd;
        this.cusBarcode = cusBarcode;
        this.cusEmail = cusEmail;
        this.cusLoginPw = cusLoginPw;
        this.cusNickname = cusNickname;
        this.cusName = cusName;
        this.cusCi = cusCi;
        this.cusDi = cusDi;
        this.cusBirthday = cusBirthday;
        this.cusGender = cusGender;
        this.cusMobileNo = cusMobileNo;
        this.cusMobileNoBk = cusMobileNoBk;
        this.cusLevel = cusLevel;
        this.cusLevelDt = cusLevelDt;
        this.cusLevelStamp = cusLevelStamp;
        this.loginFailCnt = loginFailCnt;
        this.cusStampSum = cusStampSum;
        this.cusCouponSum = cusCouponSum;
        this.cusStampCnt = cusStampCnt;
        this.cusCouponCnt = cusCouponCnt;
        this.cusStampChangeCnt = cusStampChangeCnt;
        this.cashReceiptTp = cashReceiptTp;
        this.cashReceiptNo = cashReceiptNo;
        this.lastActiveDt = lastActiveDt;
        this.notiActiveDt = notiActiveDt;
        this.regUser = userId;
        this.modUser = userId;
    }
}
