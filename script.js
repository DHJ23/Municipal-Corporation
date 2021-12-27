/*
function checkNum(str) {
	for (var i = 0; i < str.length; i++) {
		var ch = str.charAt(i);
		if (ch < "0" || ch > "9") {
			if (ch != "/" && ch != "*" && ch != "+" && ch != "-" && ch != "."
				&& ch != "(" && ch!= ")" && ch != "%") {
				alert("invalid entry!")
				return false
				}
			}
		}
		return true
}

function addChar(input, character) {
	if(input.value == null || input.value == "0")
		input.value = character
	else
		input.value += character
}

function compute(form) {
    //if (val !== 0.0) {
     // var percent = form.display.value;  
     // percent = pcent.substring(percent.indexOf("%")+1);
     // form.display.value = parseFloat(percent)/100 * val;
      //val = 0.0;
   // } else 
      form.h1.value = eval(form.h1.value);
    } */
    var screen=document.querySelector('#screen');
var btn=document.querySelectorAll('.bn');

for(item of btn)
{
    item.addEventListener('click',(e)=>{
        btntext=e.target.innerText;

        if(btntext =='×')
        {
            btntext= '*';
        }

        if(btntext=='÷')
        {
            btntext='/';
        }
        screen.value+=btntext;
    });
}

function backspc()
{
    screen.value=screen.value.substr(0,screen.value.length-1);
}
