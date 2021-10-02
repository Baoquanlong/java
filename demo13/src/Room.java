/**
 * Room 类是组成Hotel类的基本元素，
 * Room 类中应该具有以下属性：
 * 1：房间号
 * 2：房间类型
 * 3：房间是否空闲。
 *
 */
public class Room {
    public int roomId;
    /**
     * roomType 有"钟点房","标准房","主题房"三种。
     */
    public String roomType;
    public Boolean isFree;

    //无参构造函数
    public Room(){

    }
    //有参数构造函数
    public Room(int roomId,String roomType,Boolean isFree){
        this.roomId = roomId;
        this.roomType = roomType;
        this.isFree = isFree;
    }
}
