let pts = [];
for(let i = 0; i<=33; i++){
    let x = Math.random();
    let y = Math.random();
    pts.push([x,y]);
}

function approx(pts){
    let pointsThatSatisfiedFormula = [];
    for(let i = 0; i<pts.length; i++){
        let poiht = pts[i];
        let x = poiht[0];
        let y = point[1];
        if(Math.pow(x)+Math.pow(y) <= 1){
            pointsThatSatisfiedFormula.push(poiht);
        }
    }
    let approximativeValueOfPI = 4*(pointsThatSatisfiedFormula.length/pts.length);
    return approximativeValueOfPI;
}
    