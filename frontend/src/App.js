import React, { Component } from 'react';
import axios from 'axios';
import './App.css';
import ReactTable from "react-table-6";
import "react-table-6/react-table.css";

class App extends Component {
  state = {
    data: []
  }

  componentDidMount(){
    axios.get('http://localhost:8080/data/all').then((response) => {
      const data = response.data;
      this.setState({ data });
    }, (error) => {
      console.log(error);
    });
  }
  
  render(){
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
    }]

    return (  
      <div>  
        <ReactTable  
          data={this.state.data}  
          columns={columns}  
          defaultPageSize = {25}  
          pageSizeOptions = {[25, 50, 100]}  
        />  
      </div>        
    )  
  }  
}  
export default App;  