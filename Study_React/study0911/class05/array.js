import React, {useState} from 'react';

export function Array() {
    const [array] = useState([{id:1, text:'Apple'}, {id:2, text:'Banana'}, {id:3, text:'Kiwi'}]);

    const list = array.map((id) =>
        <li key={id.toString()}>{id.text}</li>
    );

    return (
        <div>
            <h1>[ARRAY]</h1>
            <ol>{list}</ol>
        </div>
    );
}