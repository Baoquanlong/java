/**
 * User 类应该是用来管理Hotel类的，我们可以通过User类来建立一个Hotel类。
 * 再从Hotel类中对房间进行操作。
 */
public class User {
    public static void main(String[] args) {
        //对酒店进行房间的添加：
        Room rm101 = new Room(101,"钟点房",true);
        Room rm102 = new Room(102,"标准房",true);
        Room rm103 = new Room(103,"标准房",true);
        Room rm104 = new Room(104,"钟点房",true);
        Room rm201 = new Room(201,"主题房",true);
        Room rm202 = new Room(202,"主题房",true);
        Room rm203 = new Room(203,"主题房",true);
        Room rm204 = new Room(204,"主题房",true);
        Room[][] rooms = {{rm101,rm102,rm103,rm104},
                {rm201,rm202,rm203,rm204}};

        //初始化一个酒店。
        Hotel ht = new Hotel(rooms);

        ht.printRoom();
        System.out.println("-----------------------");
        System.out.println("空闲房间有："+ht.free_num);
        System.out.println("-----------------------");
        ht.setRoomReserved(102);
        ht.printRoom();
        System.out.println("-----------------------");
        System.out.println("空闲房间有："+ht.free_num);
        System.out.println("-----------------------");
        ht.setRoomFree(102);
        ht.printRoom();
        System.out.println("-----------------------");
        System.out.println("空闲房间有："+ht.free_num);


    }
}
