package test_tomcat_git;

import javax.servlet.http.HttpSession;

public class UserBean
{
	private HttpSession session;//SessionID
	private String userID;//ユーザーID
	private String roomID;	//ルームID
	private String at_df;//攻守

	//setter & getter
	public HttpSession getsession() {
		return session;
	}
	public void setsession(HttpSession session) {
		// TODO 自動生成されたメソッド・スタブ
		this.session = session;
	}

	public String getuserID() {
		return userID;
	}
	public void setuserID(String userID) {
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
	public String getAt_Df() {
		return at_df;
	}
	public void setAt_Df(String at_df) {
		this.at_df = at_df;
	}

}
