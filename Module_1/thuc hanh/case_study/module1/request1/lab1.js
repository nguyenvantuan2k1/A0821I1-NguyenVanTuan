var x=4;
var y=5;
var result="";
for(var i=1;i<=x;i++){
    for(var j=1;j<=y;j++){
        if(i==1||j==1||i==x||j==y){
            result+="*";
        }else{
            result+=" ";
        }
    }
    result+="\n";
}
console.log(result);