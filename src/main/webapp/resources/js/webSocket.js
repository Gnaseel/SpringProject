/**
 * 	�� ���� ���� JS
 */

//------------------------------------�� ����---------------------------
		let sock = new SockJS("http://localhost:8220/ex/echo");
		sock.onmessage = OnMessage;
		sock.onclose = OnClose;
		
		function OnMessage(msg) {
			alert("�˶�����");
			var data = msg.data;
			var comment_alarm = 'comment_alarm';
			var next = '${alarmCount}';
			$('#pr').append(data + '<br/>');
			alert(data);
			if (data == comment_alarm) {
				$('.alarm').css("background-color", "red");
				$('.alarm').css("color", "white");
				$('.alarm').val(next);
				//�����丵 �ʿ�, �ñ����� ���� �ƴ� next�� ���ϴµ� ���ʿ��� ó���ؼ� ��� ��ߵ�
			} else
				alert(msg);
		};
		function OnClose() {
		};