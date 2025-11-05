# Đồ án: XÂY DỰNG WEBSITE BÁN QUẦN ÁO (RECOMMENDATION SYSTEM)

Đây là đồ án xây dựng website thương mại điện tử (E-commerce) bán quần áo, có tích hợp hệ thống gợi ý sản phẩm (Recommendation System) dựa trên hành vi người dùng.

## 🚀 Mô tả chung

Hệ thống cho phép người dùng thực hiện các chức năng cơ bản của một trang web bán hàng (xem sản phẩm, thêm vào giỏ, đặt hàng).

Điểm nổi bật của dự án là **hệ thống gợi ý sản phẩm**, được xây dựng dựa trên việc phân tích các hành động của người dùng như:
* Tìm kiếm sản phẩm
* Xem chi tiết sản phẩm
* Thêm vào giỏ hàng
* Tiến hành đặt hàng

Dựa trên dữ liệu này, hệ thống sẽ đưa ra các gợi ý sản phẩm cá nhân hóa, giúp tăng trải nghiệm mua sắm của người dùng.

## 💻 Công nghệ sử dụng

Dự án được xây dựng theo kiến trúc Client-Server:

* **Backend:** **Java (Spring Boot)** - Xử lý logic nghiệp vụ, API, và thuật toán gợi ý.
* **Frontend:** **ReactJS** - Xây dựng giao diện người dùng (UI/UX) tương tác.
* **Database:** **SQL Server** - Lưu trữ dữ liệu (người dùng, sản phẩm, đơn hàng, v.v.).

---

## ⚙️ Hướng dẫn cài đặt

Để chạy dự án này trên máy local, bạn cần thiết lập cả Backend và Frontend.

### 1. Backend (Spring Boot)

1.  Clone repository:
    ```bash
    git clone [LINK_REPOSITORY_CUA_BAN]
    ```
2.  Mở dự án bằng **IntelliJ IDEA**:
    * Chọn `File` > `Open...` (hoặc `Open` từ màn hình chào) và trỏ đến thư mục dự án bạn vừa clone.
    * IntelliJ sẽ tự động nhận diện đây là một dự án Maven (hoặc Gradle) và tải về các thư viện (dependencies) cần thiết.
3.  Cấu hình kết nối Database (SQL Server):
    * Mở file `src/main/resources/application.properties` (hoặc `.yml`).
    * Cập nhật các dòng sau cho phù hợp với thông tin SQL Server của bạn:
        ```properties
        spring.datasource.url=jdbc:sqlserver://localhost:1433;databaseName=[TEN_DATABASE]
        spring.datasource.username=sa
        spring.datasource.password=[PASSWORD]
        ```
    * **(Quan trọng)** Nếu bạn có file script SQL (`.sql`) để tạo cơ sở dữ liệu hoặc bảng, hãy chạy file đó trong SQL Server Management Studio (SSMS) trước khi chạy dự án.
4.  Chạy dự án:
    * Tìm đến file chính (thường có tên `...Application.java` với annotation `@SpringBootApplication`).
    * Nhấn chuột phải vào file và chọn `Run '...Application.main()'`.
    * Backend API sẽ khởi chạy, thường là tại cổng `8080`.

### 2. Frontend (ReactJS)

1.  Di chuyển vào thư mục frontend (từ thư mục gốc của dự án):
cd [FE_YourEyes]
2.  Cài đặt các thư viện cần thiết:
    ```bash
    npm install
    ```
    *(hoặc `yarn install` nếu bạn dùng Yarn)*
3.  Chạy dự án:
    ```bash
    npm start
    ```
    *(hoặc `yarn start`)*
4.  Giao diện web sẽ tự động mở và chạy tại: `http://localhost:3000`

---

## 🚀 Hướng dẫn sử dụng

### Tài khoản Demo (Ví dụ)

Bạn có thể sử dụng các tài khoản sau để kiểm tra:

* **Tài khoản Admin:**
    * Username: `admin@gmail.com`
    * Password: `123456`
* **Tài khoản User:**
    * Username: `nvb@gmail.com`
    * Password: `Nvb123.`

### Các chức năng chính

* **Đăng nhập:** Cho phép người dùng đăng nhập vào hệ thống bằng email và mật khẩu. Hệ thống phân quyền cho hai vai trò: **Admin** (quản lý sản phẩm, đơn hàng, người dùng...) và **User** (khách hàng mua sắm).
* **Xem sản phẩm:** Người dùng có thể xem danh sách sản phẩm, lọc theo danh mục, hoặc tìm kiếm sản phẩm theo tên. Nhấp vào sản phẩm để xem thông tin chi tiết (hình ảnh, mô tả, giá, size, màu sắc).
* **Thêm vào giỏ hàng:** Tại trang chi tiết, người dùng chọn thuộc tính (size, màu) và số lượng, sau đó thêm sản phẩm vào giỏ hàng.
* **Đặt hàng:** Từ giỏ hàng, người dùng tiến hành thanh toán, nhập thông tin giao hàng (tên, địa chỉ, SĐT) và xác nhận để hoàn tất đơn hàng.
* **Hệ thống gợi ý (Tính năng chính):** Dựa trên các hành động của người dùng (xem, tìm kiếm, thêm vào giỏ), hệ thống sẽ hiển thị các sản phẩm gợi ý cá nhân hóa (ví dụ: "Sản phẩm dành cho bạn", "Có thể bạn cũng thích") trên trang chủ và trang chi tiết sản phẩm.

---

## 👥 Tác giả

**[CẦN BỔ SUNG]**

* Nguyễn Thanh Phú - N22DCCN060
* Nguyễn Đức Đoàn Quyền - N22DCCN067
