function moneyChange()
{
    let input = document.getElementById('sotien') ;
    let a1 = document.getElementById("from").selectedIndex;
    let a = document.getElementById("from").options;
    let b1 = document.getElementById("to").selectedIndex;
    let b = document.getElementById("to").options;
    if(a[a1].text == 'VNĐ'  && b[b1].text =='USD')
    {
        let result = input.value/23000 ;
        document.getElementById('temp').innerText = 'result: ' + result;
    }
    else if (a[a1].text == 'USD'  && b[b1].text =='VNĐ')
    {
        let result = input.value*23000 ;
        document.getElementById('temp').innerText = 'result: ' + result;
    }
    else
    {
        alert('Hãy chọn đúng mục đổi');
    }
}