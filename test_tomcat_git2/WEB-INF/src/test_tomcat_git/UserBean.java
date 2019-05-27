package test_tomcat_git;

public class UserBean
{
	private String userID;//ユーザーID
	private String roomID;	//ルームID
	private String at_df;//攻守

	//setter & getter
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
		return roomID;
	}
	public void setAt_Df(String at_df) {
		this.at_df = at_df;
	}

}
