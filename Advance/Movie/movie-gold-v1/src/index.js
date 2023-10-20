import React from 'react';
import ReactDOM from 'react-dom/client';
import './index.css';
import App from './App';
import 'bootstrap/dist/css/bootstrap.min.css'
import { BrowserRouter, Route, Routes } from 'react-router-dom';
// npm install axios
// npm install bootstrap
// npm i react-bootstrap
// npm i @fortawesome/react-fontawesome
// npm i @fortawesome/free-solid-svg-icons
// npm i react-player 
// npm i react-router-dom
// npm install @mui/material @emotion/react @emotion/styled
// npm install react-material-ui-carousel

const root = ReactDOM.createRoot(document.getElementById('root'));
root.render(
  <React.StrictMode>
    <BrowserRouter>
      <Routes>
        <Route path='/*' element={<App/>}/>
      </Routes>
    </BrowserRouter>
  </React.StrictMode>
);
