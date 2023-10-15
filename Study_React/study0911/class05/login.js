import React, {useState} from 'react';

export function LoginForm() {
    const [value, setValue] = useState('');

    const handleChange = (event) => setValue(event.target.value);

    const handleSubmit = (event) => {
        if(value == '') {
            alert('로그인해주세요.');
        } else {
            alert('환영합니다. ' + value + '님');
            event.preventDefault();
        }
    }

    return (
        <form onSubmit={handleSubmit}>
            <h1>[LOGIN]</h1>
            <label>Name : 
                <input type='text' value={value} onChange={handleChange} />
            </label>
            <input type='submit' value='submit' />
        </form>
    );
}