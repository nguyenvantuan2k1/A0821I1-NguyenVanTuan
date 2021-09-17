var h=5;
var result="";
for(var i=1;i<=h;i++){
    //can chinh
    for(var k=h;k>i;k--){
        result+=" ";
    }
    var x=(i*2)-1;
    for(var j=1;j<=x;j++){
        if(i==1||i==h||j==1||j==x)
            result+="*";
        else result+=" ";
    }
    result+="\n";
}
console.log(result);