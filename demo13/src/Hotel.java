import org.jetbrains.annotations.NotNull;

import java.security.PublicKey;

/**
 * Hotel 类应该是以Room类作为元素的类。
 * Hotel 类中应该具有的元素有：
 * 1：房间。Rooms【】【】
 * 2： 是否有空房。
 * 3: 空房数量。
 * 方法应该有：输出所有房间的状态
 * 方法应该有设置房间为空或者是为满。即退房和预订两种模式。
 */
public class Hotel {
    public int free_num;
    public Room[][] rooms;
    public Hotel(){
        free_num = 0;
    }
    public Hotel(Room[][] rooms){
        int index = 0;
        for (int i = 0; i < rooms.length; i++) {
            for(int j = 0;j<rooms[i].length;j++){
                index++;
            }
        }
        this.free_num = index;
        this.rooms = rooms;
    }
    public void setRoomReserved(@NotNull int roomId){
        for (int i = 0; i <rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].roomId == roomId){
                    rooms[i][j].isFree = false;
                    this.free_num--;
                    break;
                }
            }
        }
    }
    public void setRoomFree(@NotNull int roomId){
        for (int i = 0; i <rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                if (rooms[i][j].roomId == roomId){
                    rooms[i][j].isFree = true;
                    this.free_num++;
                    break;
                }
            }
        }
    }

    /**
     * 输出所有房间状态，信息的方法：
     */
    public void printRoom(){
        for (int i = 0; i < rooms.length; i++) {
            for (int j = 0; j < rooms[i].length; j++) {
                System.out.println("房间"+rooms[i][j].roomId+"的信息：");
                System.out.println("房间类型: "+rooms[i][j].roomType);
                System.out.println("房间是否空闲: "+rooms[i][j].isFree);
            }
        }
    }
}
