package vn.fis.training.domain;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.UUID;

public class Customer {
    /** ID cua Customer la duy nhat trong toan bo he thong
       Su dung @java.util.UUID de tao id gan cho tung customer
    */
    private String id = UUID.randomUUID().toString();


    /** Constraints:
        1. Khong duoc trong (NOT NULL OR BLANK)
        2. Do dai tu tu 5 den 50 ky tu, chi bao gom ky tu a->z, A->Z va khong trang (Blank).
        3. Truoc khi cap nhat vao he thong truong ten phai duoc chuan hoa.
            Qui tac chuan hoa:
                *. Bo cac ky tu trang o dau va cuoi
                *. Upper case chu cai dau tien truoc cac tu
                   VD: nGuyen van    BinH      -> Nguyen Van Binh
    **/
    private String name;
    /** Constraints:
        1. Khong duoc trong
        2. Tinh toan de khong cho phep nhap Customer nho hon 10 tuoi so voi thoi diem hien tai
     **/
    private LocalDate birthDay;
    /** Constraints:
    *   1. Do dai 10 ky tu bat dau bang ky tu 0, chi bao gom cac so tu 0->9
     *  2. So dien thoai la duy nhat trong toan bo he thong. Duoc su dung de kiem tra duplicate khach hang
     *  3. Chuan hoa lai truong so dien thoai truoc khi cap nhat vao he thong. Bo cac ky tu trang o dau, giua va cuoi
     *     Vidu: 0921 000 008 --> 0921000008
    * */
    private String mobile;

    /** Constraints:
     * NOT NULL
     * */

    private CustomerStatus status;

    /**
     * Thoi gian tao doi tuong. mac dinh la thoi diem hien tai
     */

    private LocalDateTime createDateTime;

    // TODO: Implement Getters, Setters, Constructors, Equals
    public Customer(String id, String name, LocalDate birthDay, String mobile, CustomerStatus status) {
        this.birthDay = birthDay;
        this.mobile = mobile;
        this.id = id;
        this.name = name;
        this.status = status;
        setCreateDateTime();
    }

    private void setCreateDateTime() {
        this.createDateTime = LocalDateTime.now();
    }

    public Customer() {
    }
    public String getID() {
        return id;
    }
    public String setID(String id) {
        return this.id = id;
    }
    public String getName() {
        return name;
    }
    public String setName(String name) {
        return this.name = name;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public LocalDate setBirthDay(LocalDate birthDay) {
        return this.birthDay = birthDay;
    }
    public String getMobile() {
        return mobile;
    }
    public String setMobile(String mobile) {
        return this.mobile = mobile;
    }
    public CustomerStatus getStatus() {
        return status;
    }
    public CustomerStatus setStatus(CustomerStatus status) {
        return this.status = status;
    }
    public boolean equals(Object that) {
        // Hai nguoi là 1 neu co chung ID hoac so dien thoai
        if (this == that) return true;
        if (that == null || getClass() != that.getClass()) return false;
        Customer id1 = (Customer) that;
        return Objects.equals(id, id1.id) && Objects.equals(name, id1.name) && Objects.equals(birthDay, id1.birthDay) && Objects.equals(mobile, id1.mobile) && status == id1.status && Objects.equals(createDateTime, id1.createDateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, birthDay, mobile, status, createDateTime);
    }
}


