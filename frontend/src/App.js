import React, { Component } from 'react';
import ReactDOM from 'react-dom';
import axios from 'axios';
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";
import { Helmet } from 'react-helmet'
import './App.css';
import spinner from "./128x128.gif";

class App extends Component {
  state = {
    data: []
  }

  componentDidMount(){
    axios.get('https://kingsmenbackend.uc.r.appspot.com/data/all').then((response) => {
      const data = response.data;
      this.setState({ data });
      const columns = [
        {
          Header: 'Name',  
          accessor: 'name'  
        },
        {  
          Header: 'Price',  
          accessor: 'cost'  
        },
        {
          Header: 'In Stock',
          id: 'stocked',
          accessor: (row) => { return row['stocked'].toString() === 'true' ? 'Yes' : 'No' }
        }];
      const table = <div id="table">
        <ReactTable  
          data={this.state.data}
          columns={columns}  
          defaultPageSize = {25}  
          pageSizeOptions = {[25, 50, 100]}
        />
      </div>;
    ReactDOM.render(table, document.getElementById("Spinner"));
    }, (error) => {
      console.log(error);
    });
  }
  
  render(){
    return (
        <div id="root">
          <Helmet>
            <title>Jake's Fake Store</title>
          </Helmet>
          <div id="intro-text">
            <h1>Welcome to Jake's Fake Store!</h1>
            <p>Feel free to browse our products below:</p>
          </div>
          <div id="Spinner">
            <img src={ spinner } alt="loading" />
          </div>
        </div>
    )  
  }
}  
export default App;  