let n1 = document.getElementById('x');
let n2 = document.getElementById('y');
function add()
{
    let result = parseInt(n1.value) + parseInt(n2.value);
    document.getElementById('temp').innerText = '\nResult: ' + result;
}
function sub()
{
     let result = n1.value - n2.value ;
     document.getElementById('temp').innerText = '\nResult: ' + result;
 }
 function mul()
 {
     let result = n1.value * n2.value ;
     document.getElementById('temp').innerText = '\nResult: ' + result;
 }
 function div()
 {
     let result = n1.value / n2.value;
     document.getElementById('temp').innerText = '\nResult: ' + result;
 }