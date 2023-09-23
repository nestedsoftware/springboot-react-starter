import { useState, useEffect } from 'react';

export default function Game() {
  const [values, setValues] = useState([])

  useEffect(() => {
    fetch('http://localhost:8080/items')
    .then((response) => response.json())
    .then((data) => {
      console.log(data);
      setValues(data);
    })
    .catch((err) => {
      console.log(err.message);
    });
  }, []);

  const items = values.map(value =>
    <li key={value.id}>
      <p>
        {value.itemName}
      </p>
    </li>);

  return (
    <ul>
      {items}
    </ul>
  );
}

