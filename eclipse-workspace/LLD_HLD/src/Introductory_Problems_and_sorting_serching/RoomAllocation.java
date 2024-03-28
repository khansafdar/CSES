package Introductory_Problems;
import java.util.*;
public class RoomAllocation {
	static class room{
		int enter,exit,index;
		room(int enter, int exit, int index){
			this.enter = enter;
			this.exit = exit;
			this.index = index;
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		room rooms[] = new room[n];
		for(int i = 0; i < n; i++) {
			room nr = new room(sc.nextInt(), sc.nextInt(), i);
			rooms[i] = nr;
		}
		Arrays.sort(rooms, (a, b) -> {
			if(a.enter == b.enter) {
				return a.exit - b.exit;
			}
			return a.enter - b.enter;
		});
		PriorityQueue<room> pq = new PriorityQueue<room>((a, b) ->{
			return a.enter - b.enter;
		});
		int roomID = 1;
		int roomAssigned[] = new int[n];
		Arrays.fill(roomAssigned, 0);
		for(int i = 0; i < n; i++) {
			if(pq.size() == 0) {
				room nr = new room(rooms[i].exit, roomID, -1);
				pq.add(nr);
				roomAssigned[rooms[i].index] = roomID;
				roomID += 1;
			}else {
				room rr = pq.peek();
				if(rr.enter < rooms[i].enter) {
					roomAssigned[rooms[i].index] = rr.exit;
					pq.add(new room(rooms[i].exit,rr.exit, -1));
					pq.remove(rr);
				}else {
					room nr = new room(rooms[i].exit, roomID, -1);
					pq.add(nr);
					roomAssigned[rooms[i].index] = roomID;
					roomID += 1;
				}
			}
		}
		System.out.println(roomID - 1);
		for(int i = 0; i < n; i++) {
			System.out.print(roomAssigned[i] +" ");
		}
	}
}
