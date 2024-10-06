package entity;

import java.time.LocalDate;
import java.util.Objects;

public class ChiTiet_DonDatPhong_DichVu {
    private String maCT_DDP_DV;  // Mã chi tiết đơn đặt phòng - dịch vụ
    private int soLuongDat;  // Số lượng dịch vụ đặt
    private LocalDate ngayTao;  // Ngày tạo đơn đặt dịch vụ
    private DichVu dichVu;  // Đối tượng dịch vụ
    private DonDatPhong donDatPhong;  // Đối tượng đơn đặt phòng

    // Constructor đầy đủ tham số
    public ChiTiet_DonDatPhong_DichVu(String maCT_DDP_DV, int soLuongDat, LocalDate ngayTao, DichVu dichVu, DonDatPhong donDatPhong) {
        setMaCT_DDP_DV(maCT_DDP_DV);
        setSoLuongDat(soLuongDat);
        this.ngayTao = ngayTao;
        setDichVu(dichVu);
        setDonDatPhong(donDatPhong);
    }

    // Getter và Setter cho các thuộc tính
    public String getMaCT_DDP_DV() {
        return maCT_DDP_DV;
    }

    public void setMaCT_DDP_DV(String maCT_DDP_DV) {
        if (maCT_DDP_DV == null || maCT_DDP_DV.isEmpty()) {
            throw new IllegalArgumentException("Mã chi tiết đơn đặt phòng - dịch vụ không được rỗng");
        }
        this.maCT_DDP_DV = maCT_DDP_DV;
    }

    public int getSoLuongDat() {
        return soLuongDat;
    }

    public void setSoLuongDat(int soLuongDat) {
        if (soLuongDat <= 0) {
            throw new IllegalArgumentException("Số lượng đặt phải lớn hơn 0");
        }
        this.soLuongDat = soLuongDat;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public void setDichVu(DichVu dichVu) {
        if (dichVu == null) {
            throw new IllegalArgumentException("Dịch vụ không được null");
        }
        this.dichVu = dichVu;
    }

    public DonDatPhong getDonDatPhong() {
        return donDatPhong;
    }

    public void setDonDatPhong(DonDatPhong donDatPhong) {
        if (donDatPhong == null) {
            throw new IllegalArgumentException("Đơn đặt phòng không được null");
        }
        this.donDatPhong = donDatPhong;
    }

    // Override phương thức equals và hashCode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ChiTiet_DonDatPhong_DichVu that)) return false;
        return Objects.equals(maCT_DDP_DV, that.maCT_DDP_DV);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maCT_DDP_DV);
    }

    // Override phương thức toString
    @Override
    public String toString() {
        return "ChiTiet_DonDatPhong_DichVu{" +
                "maCT_DDP_DV='" + maCT_DDP_DV + '\'' +
                ", soLuongDat=" + soLuongDat +
                ", ngayTao=" + ngayTao +
                ", dichVu=" + dichVu +
                ", donDatPhong=" + donDatPhong +
                '}';
    }
}
