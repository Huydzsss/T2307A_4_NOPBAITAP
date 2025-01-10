<!-- List Interface: Là interface của collection interface, cho phép lưu trữ các đối tượng có thứ tự.

List: Là một danh sách các phần tử có thứ tự, có thể chứa nhiều phần tử giống nhau. Các lớp thường triển khai interface List bao gồm:
ArrayList: Một danh sách các phần tử được sắp xếp theo thứ tự, có thể chứa các phần tử trùng nhau. ArrayList sử dụng mảng động để lưu trữ các phần tử.
LinkedList: Một danh sách liên kết động các phần tử, có thể chứa các phần tử trùng nhau. LinkedList sử dụng cấu trúc dữ liệu liên kết (Linked list) để lưu trữ phần tử.
Sự khác biệt giữa ArrayList và LinkedList:
ArrayList: Tối ưu cho các thao tác truy cập ngẫu nhiên (get/set) vì các phần tử được lưu trữ trong một mảng. Tuy nhiên, việc thêm hoặc xóa phần tử giữa danh sách sẽ chậm hơn do phải di chuyển các phần tử.
LinkedList: Tối ưu cho việc thêm và xóa phần tử ở đầu hoặc cuối danh sách. Tuy nhiên, việc truy cập ngẫu nhiên sẽ chậm hơn vì phải duyệt qua các phần tử từ đầu hoặc cuối danh sách.
Set Interface: Là một danh sách chứa các phần tử không có thứ tự, không cho phép các phần tử trùng nhau.

HashSet: Một tập hợp không duy trì thứ tự và không cho phép các phần tử trùng nhau.
LinkedHashSet: Một tập hợp duy trì thứ tự chèn các phần tử, không cho phép các phần tử trùng nhau.
TreeSet: Một tập hợp duy trì thứ tự sắp xếp của các phần tử, không cho phép phần tử trùng nhau.
Map Interface: Lưu trữ các phần tử theo cặp giá trị (key, value). Không cho phép có các cặp key trùng nhau.

HashMap: Một Map không duy trì thứ tự của các phần tử, không cho phép các key trùng nhau.
LinkedHashMap: Một Map duy trì thứ tự chèn các phần tử, không cho phép các key trùng nhau.
TreeMap: Một Map duy trì thứ tự sắp xếp của các key theo thứ tự tự nhiên hoặc theo một Comparator cụ thể.
Queue Interface: Lưu trữ các phần tử theo công thức FIFO (First in, first out).

PriorityQueue: Một queue cho phép các phần tử có thứ tự ưu tiên (theo một tiêu chí nhất định, chẳng hạn như độ ưu tiên cao nhất sẽ được xử lý trước).
LinkedList: Cũng có thể được sử dụng như một Queue với phương thức add(), poll(), và peek(); -->


1.List interface:
List Interface: là interface của collection interface,
chúng ta có thể lưu trữ các tập hợp các đối tượng có Thứ Tự.

-List: Là một danh sách phần tử có thứ tự,list có thể chứa 2 hoặc nhiều các phần tử giống nhau.
-Set:Là một danh sách chứa các phân tử ko có thứ tụ,không cho phép các phần tử trùng nhau.
-Map: Lưu trữ các phần tử theo cặp giá trị(key,value),ko cho phép có các cặp key trùng nhau.
-Queue:Lưu các phần tử theo công thức FIFO(First in first out).


