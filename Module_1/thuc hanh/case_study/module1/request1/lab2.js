var h=5;
var result="";
for(var i=0;i<h-1;i++){
    for(var j=0;j<h;j++){
        if(j==0||j==i){
            result+="*";
        }else{
            result+=" ";
        }
    }
    result+="\n";
    }
for(var i=0;i<=h;i++){
    result+="*";
}
console.log(result);