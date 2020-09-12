
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
		$.get(href, function(country, status){
			$('#idDetails').val(country.id);
			$('#descriptionDetails').val(country.description);
			$('#capitalDetails').val(country.capital);
			$('#codeDetails').val(country.code);
			$('#lastModifiedByDetails').val(country.lastModifiedBy);
			$('#lastModifiedDateDetails').val(country.lastModifiedDate.substr(0,19).replace("T", " "));
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