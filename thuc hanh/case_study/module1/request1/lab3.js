var h=5;
// var x=(h/2)+1;
// var t=1;
var result="";
// while(h>0){
//     for(var i=0;i<=x;i++){
//         result+=" ";
//     }
//     for(var j=0;j<t;j++){
//         result+="*";
//     }
//     result+="\n";
//     h--;
//     x--;
//     t+=2;
// }
for(var i=1;i<=h;i++){
    for(var k=h;k>i;k--){
        result+=" ";
    }
    for(var j=1;j<=(i*2)-1;j++){
        result+="*";
    }
    result+="\n";
}
console.log(result);