import {useParams} from 'react-router-dom';

function Chatting({data}) {
    const {id} = useParams();
    const chatting = data.find((chatting) => chatting.id === parseInt(id));

    return (
        <>
            <div>
                <h2>이름 : {chatting.name}</h2>
                <p>대화 : {chatting.price}</p>
            </div>
        </>
    );
}

export default Chatting;