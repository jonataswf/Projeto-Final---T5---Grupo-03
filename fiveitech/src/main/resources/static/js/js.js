$(function () {

	$('.menu-m').click(function () {
		$('.menu-lateral').slideToggle();
		$(this).toggleClass('active');
		return false;
	});
	$('.filtro').click(function () {
		$('.mostraFiltro').slideToggle();
		$(this).toggleClass('active');
		return false;
	});

	$('.senha').click(function () {
		$('.esquecisenha').slideToggle();
		$(this).toggleClass('active');
		return false;
	});

	$(function () {
		$("#tab").tabs();
	});
	$("#accordion").accordion({
		collapsible: true,
		autoHeight: false,
		active: false,
		heightStyle: "content"
	});


});

function fecharMsg(obj) {
	$(".msg").hide();
}