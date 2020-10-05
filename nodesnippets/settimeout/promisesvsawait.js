let array = [
    {
        id :1,
        name : "uno"
    },
    {
        id :2,
        name : "dos"
    },
    {
        id :3,
        name : "tres"
    }
];



const getDatos = () => {
    return new Promise(
        (resolve,reject) => {
            setTimeout(() => {
                resolve(array);
            }, 1000);
        }
    );

}
let datos = [];
const name = async (params) => {
     datos = await getDatos();
    console.log(datos);
}

console.log(name());


