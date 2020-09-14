
 $('document').ready(function() {
	
	$('table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(applied, status){
			$('#industryEdit').val(applied.industry);
			$('#companyNameEdit').val(applied.companyName);
			$('#employeeTypeEdit').val(applied.employeeType);
			$('#jobTitleEdit').val(applied.jobTitle);
			$('#appliedDateEdit').val(applied.appliedDate);
			$('#locationEdit').val(applied.location);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(applied, status){
			$('#idDetails').val(applied.id);
			$('#descriptionDetails').val(applied.description);
			$('#capitalDetails').val(applied.capital);
			$('#codeDetails').val(applied.code);
			$('#lastModifiedByDetails').val(applied.lastModifiedBy);
			$('#lastModifiedDateDetails').val(applied.lastModifiedDate.substr(0,19).replace("T", " "));
		});			
		$('#detailsModal').modal();		
	});	
	
	$('.table #deleteButton').on('click',function(event) {
		event.preventDefault();
		var href = $(this).attr('href');
		$('#confirmDeleteButton').attr('href', href);
		$('#deleteModal').modal();		
	});	
});