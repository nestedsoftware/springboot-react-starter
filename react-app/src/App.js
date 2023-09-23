import { useState, useEffect } from 'react';

import { Grid, List, ListItem, ListItemIcon, ListItemText } from '@mui/material'
import * as Muicon from "@mui/icons-material";

export default function Items() {
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

  const Icon = Muicon['CoffeeTwoTone']

  const items = values.map(value =>
    <ListItem key={value.id}>
      <ListItemIcon>
        <Icon fontSize="large" sx={{ px: 1 }}/>
      </ListItemIcon>
      <ListItemText primary={value.itemName}/>
    </ListItem>
  );

  return (
    <Grid item xs={12} md={6}>
      <List>
      {items}
      </List>
    </Grid>
  );
}

