const calculateTemp=()=>{
    const numberTemp=document.getElementById('temp').value;

    const temp_Selected=document.getElementById('temp_diff');
    const valueTemp=temp_diff.options[temp_Selected.selectedIndex].value;

    const celtofah=(cel)=>{
        let fahrenheit=(cel*9/5)+32;
        return fahrenheit;
    }

    const fahtocel=(fah)=>{
        let celcius=(fah-32)*5/9;
        return celcius;
    }


    let res;

    if(valueTemp=='cel'){
        res=celtofah(numberTemp);
        document.getElementById('resultContainer').innerHTML=`= ${res} Fahrenheit`;
    }
    else if(valueTemp=='fah'){
        res=fahtocel(numberTemp);
        document.getElementById('resultContainer').innerHTML=`= ${res} Celcius`;
    }
}
