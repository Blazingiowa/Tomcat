package test_tomcat_git;

import javax.servlet.http.HttpSession;

public class UserBean
{
	private HttpSession session;//SessionID
	private String userID;//ユーザーID
	private String roomID;	//ルームID
	private String userNumber;//プレイヤー番号 1 or 2 ?

	//setter & getter
	public HttpSession getSession() {
		return session;
	}
	public void setSession(HttpSession session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}


	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		// TODO 自動生成されたメソッド・スタブ
		this.userID = userID;
	}


	public String getRoomID() {
		return roomID;
	}
	public void setRoomID(String roomID) {
		// TODO 自動生成されたメソッド・スタブ
		this.roomID = roomID;
	}


	public String getUserNumber() {
		return roomID;
	}
	public void setUserNumber(String roomID) {
		// TODO 自動生成されたメソッド・スタブ
		this.roomID = roomID;
	}
}
