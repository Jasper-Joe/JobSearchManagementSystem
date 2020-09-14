
 $('document').ready(function() {
	
	$('table #editButton').on('click',function(event){		
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(rejected, status){
			$('#industryEdit').val(rejected.industry);
			$('#companyNameEdit').val(rejected.companyName);
			$('#employeeTypeEdit').val(rejected.employeeType);
			$('#jobTitleEdit').val(rejected.jobTitle);
			$('#appliedDateEdit').val(rejected.appliedDate);
			$('#locationEdit').val(rejected.location);
		});			
		$('#editModal').modal();		
	});
	
	$('.table #detailsButton').on('click',function(event) {
		event.preventDefault();		
		var href= $(this).attr('href');		
		$.get(href, function(rejected, status){
			$('#idDetails').val(rejected.id);
			$('#descriptionDetails').val(rejected.description);
			$('#capitalDetails').val(rejected.capital);
			$('#codeDetails').val(rejected.code);
			$('#lastModifiedByDetails').val(rejected.lastModifiedBy);
			$('#lastModifiedDateDetails').val(rejected.lastModifiedDate.substr(0,19).replace("T", " "));
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