/**
 * �Խ��ǿ��� ���Ǵ� js�Լ�
 */

// ������ ������ �� ����Ǵ� �Լ� - �ش��ϴ� �Խñ۷� �̵�
function selectPost(post_ID) {
	var frm = $('#selectPost');
	frm.attr('method', 'GET');
	frm.append("<input type='hidden' name='idx' value='" + post_ID + "'>")
	// alert("id = " + this.id);
	frm.submit();
};

// ������ �̵� ��ư�� ������ �� ����Ǵ� �Լ� - ������ �̵�(�Խ����� ������)
function selectPage() {
	var url = "";
	// alert("id = " + this.id);
	// --------------------------------------------������ ��ȣ
	// ����--------------------------------------------------------
	if (this.id == "prev") {
		url = '/ex/Board/getBoardList?setPage=' + $
		{
			page.curPage - page.range
		}
		;
	} else if (this.id == "next") {
		url = '/ex/Board/getBoardList?setPage=' + $
		{
			page.curPage + page.range
		}
		;
	} else {
		url = '/ex/Board/getBoardList?setPage=' + this.value;
	}

	// --------------------------------------------�˻� ����

	if (query == null) {
		alert("�˻����� ����");
	} else {
		url += "&searchContent=" + query;
	}
	location.href = url;
};