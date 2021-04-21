function tinhNgay()
{
    let t = eval(month.value);
    switch (t)
    {
        case 4 :case 6 :case 9 :case 11 :
            alert('tháng ' + t + ' có 30 ngày');
            break;
        case 2 :
            alert('tháng ' + t + ' có 28 hoặc 29 ngày');
            break;
        case 1 : case 3 :case 5 :case 7 :case 8 :case 10 :case 12:
            alert('tháng ' + t + ' có 31 ngày');
            break;
        default:
            alert("Bạn đã nhập sai tháng");
    }
}