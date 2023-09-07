//Linked list là 1  cấu trúc dữ liệu tuyến tính . các phần tử list  được liên kết không đươc lưu trữ tại 1 vị trí liền kề
// mà được liên kết bằn con trỏ, bao gồm các Node đc kết nối. mỗi Node lưu trữ dữ liệu và địa chỉ nút tiếp theo.
// Mảng có thể được sử dụng để lưu trữ dữ liệu tuyến tính có kiểu tương tự, nhưng mảng có những hạn chế sau:
// Kích thước của mảng là cố định :phải biết trước giới hạn trên của số lượng phần tử. Ngoài ra, nói chung, bộ nhớ được phân bổ bằng với giới hạn trên bất kể mức sử dụng. 
// Chèn phần tử mới / Xóa phần tử hiện có trong một mảng các phần tử rất tốn kém(chỉ tien cho CPU)Phải tạo phòng cho các phần tử mới và để tạo phòng, 
//     các phần tử hiện có phải được dịch chuyển nhưng trong Danh sách liên kết nếu chúng ta có nút đầu thì chúng ta có thể đi qua bất kỳ nút nào thông qua nút đó và chèn nút mới vào vị trí cần thiết.
// Ưu điểm của Linked list so với List:
//     Mảng động.
//     Dễ dàng Chèn/Xóa.
// Chèn vào đầu là một hoạt động thời gian không đổi và mất O(1) thời gian, so với mảng trong đó chèn 
// một phần tử vào đầu mất O(n) thời gian, trong đó n là số phần tử trong mảng.

// Các loại danh sách liên kết:
//  Simple Linked List  – Trong loại danh sách được liên kết này, người ta có thể di chuyển \
//    hoặc duyệt qua danh sách được liên kết chỉ theo một hướng. trong đó con trỏ tiếp theo của mỗi nút trỏ đến 
    // các nút khác nhưng con trỏ tiếp theo của nút cuối cùng trỏ đến NULL. Nó còn được gọi là “ Danh sách liên kết đơn lẻ” .
//  Danh sách liên kết kép Doubly Linked List –– Trong loại danh sách được liên kết này, người ta có thể di chuyển hoặc duyệt qua danh sách 
//   được liên kết theo cả hai hướng (Tiến và Lùi)
//  Danh sách liên kết vòng  Circular Linked List – Trong loại danh sách được liên kết này, nút cuối cùng của danh sách được liên kết 
//    chứa liên kết của nút đầu tiên/nút đầu của danh sách được liên kết trong con trỏ tiếp theo của nó.
//  Danh sách liên kết vòng đôi  Doubly Circular Linked List – Danh sách liên kết vòng đôi hoặc danh sách liên kết hai chiều vòng là một loại danh sách liên kết phức tạp hơn có chứa một con trỏ tới nút tiếp theo cũng như nút trước đó trong chuỗi. Sự khác nhau giữa danh sách kép liên kết kép và danh sách kép vòng cũng giống như sự khác biệt giữa danh sách liên kết đơn và danh sách liên kết vòng. Danh sách liên kết kép vòng không chứa null trong trường trước đó của nút đầu tiên.
//  Danh sách liên kết tiêu đề Header Linked List – Danh sách liên kết tiêu đề là một loại danh sách liên kết đặc biệt có chứa nút tiêu đề
//    ở đầu danh sách. 

// Biểu diễn danh sách liên kết đơn: 
// Một danh sách được liên kết được biểu diễn bằng một con trỏ tới nút đầu tiên của danh sách được liên kết. Nút đầu tiên được gọi là nút đầu của danh sách liên kết. Nếu danh sách liên kết rỗng thì giá trị của phần đầu trỏ tới NULL. 

// Mỗi nút trong danh sách bao gồm ít nhất hai phần: 

// Một mục dữ liệu (chúng tôi có thể lưu trữ số nguyên, chuỗi hoặc bất kỳ loại dữ liệu nào).
// Con trỏ (Hoặc Tham chiếu) tới nút tiếp theo (kết nối nút này với nút khác) hoặc Địa chỉ của nút khác