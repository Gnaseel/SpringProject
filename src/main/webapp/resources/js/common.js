/**
 * ��κ��� ���������� ���������� �̿��ؾ� �ϴ� ��ɵ�
 */

// Mypage Ŭ��
function mypageClick() {
	location.href = "/ex/Main/myPage";
}
// Logout ��ư Ŭ��
function logout() {
	location.href = "/ex/Main/logOut";
}
//Ȩ �ΰ� Ŭ�� (���� ������ �̵�)
function goHome() {
	location.href = "/ex/";
}
//�˶� ����Ʈ ���
function getAlarmList() {
	var left = window.screen.width / 2 - 300;
	var top = window.screen.height / 2 - 200;
	window.open("/ex/Alarm/getAlarmList", "alarm",
			"width=600, height=400, left=" + left + ", top=" + top);
}
//���� ����Ʈ ���
function getMeetingList() {
	var left = window.screen.width / 2 - 250;
	var top = window.screen.height / 2 - 200;
	window.open("/ex/Meeting/getMeetingList?userID=${userID}",
			"meeting", "width=500, height=400, left=" + left + ", top="
					+ top);
}
