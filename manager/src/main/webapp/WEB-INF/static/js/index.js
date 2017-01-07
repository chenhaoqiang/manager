$(function() {
	showAccordion();
	bindEvents();
});

function bindEvents() {
	// 任务列表-关闭按钮点击
	$('.tasklist .tasklist-title').on('click', 'i', function() {
		$(this).parent().parent().remove();
	});
	
	// 未完成任务选择框点击
	$('.tasklist-uncomplete').on('click', 'i', function() {
		var completeTask = "<li><i class='glyphicon glyphicon-check'></i>" + $(this).parent().text() + "<span>(2016-12-19 11:18:00)</span></li>";
		$(this).parents('.tasklist-content').find('.tasklist-complete ul').append(completeTask);
		$(this).parent().remove();
	});
	
	// 已完成任务选择框点击
	$('.tasklist-complete').on('click', 'i', function() {
		var unCompleteTask = "<li><i class='glyphicon glyphicon-unchecked'></i>" + $(this).parent().text() + "</li>";
		$(this).parents('.tasklist-content').find('.tasklist-uncomplete ul').append(unCompleteTask);
		$(this).parent().remove();
	});
	
	// 任务点击文字选中
	$('.tasklist-content').on('click', '.task', function() {
		$(this).select();
	});
	
	// 任务双击变成编辑状态
	$('.tasklist-content').on('dblclick', '.task', function() {
		$(this).removeClass('task');
		$(this).addClass('task-edit');
		$(this).removeAttr('readonly');
		$(this).select();
	});
	
	// 任务失去焦点后恢复原状
	$('.tasklist-content').on('blur', '.task-edit', function() {
		$(this).removeClass('task-edit');
		$(this).addClass('task');
		$(this).attr('readonly','readonly');
	});
}

/**
 * 显示手风琴
 */
function showAccordion() {
	var Accordion = function(el, multiple) {
		this.el = el || {};
		this.multiple = multiple || false;

		// Variables privadas
		var links = this.el.find('.link');
		// Evento
		links.on('click', {el: this.el, multiple: this.multiple}, this.dropdown);
	};

	Accordion.prototype.dropdown = function(e) {
		var $el = e.data.el;
			$this = $(this),
			$next = $this.next();

		$next.slideToggle();
		$this.parent().toggleClass('open');

		if (!e.data.multiple) {
			$el.find('.submenu').not($next).slideUp().parent().removeClass('open');
		};
	};

	new Accordion($('#accordion'), false);
}