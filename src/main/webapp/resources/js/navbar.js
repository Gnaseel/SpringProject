/**
 * ��� �׺���̼� �ٿ��� ����ϴ� js �Լ�
 */
// ������ �˻�
function byLocation(loca) {
	location.href = "/ex/Board/getPostListByLocation?location="
			+ encodeURI(loca);
}
// ī�װ��� �˻�
function byLocation(cate) {
	location.href = "/ex/Board/getPostListByCategory?category="
			+ encodeURI(cate);
}
