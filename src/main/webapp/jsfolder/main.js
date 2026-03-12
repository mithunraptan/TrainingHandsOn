/*
const selectedElement = $("a");
selectedElement.addEventListener("click", function () {
	fetch("ViewEmployeesAction.action")
	.then(response=>response.json())
	.then(data=>{console.log(data[0].name)});
}); */

/*$("a").click(()=>{
	fetch("viewEmployees.action")
		.then(response=>response.json())
		.then(data=>{console.log(data[0].name)});
})*/




document.addEventListener("DOMContentLoaded", function () {

    const btn = document.getElementById("loadEmployeeBtn");

    btn.addEventListener("click", function (event) {

        event.preventDefault();

        fetch("viewEmployees.action")
            .then(response => response.json())
            .then(data => {

                const resultDiv = document.getElementById("resultDiv");

                let html = "<table border='1'>";
                html += "<tr><th>ID</th><th>Name</th><th>Email</th></tr>";

                data.forEach(emp => {
                    html += "<tr>";
                    html += "<td>" + emp.id + "</td>";
                    html += "<td>" + emp.name + "</td>";
                    html += "<td>" + emp.email + "</td>";
                    html += "</tr>";
                });

                html += "</table>";

                resultDiv.innerHTML = html;

            })
            .catch(error => {
                console.error("Error:", error);
            });

    });

});

