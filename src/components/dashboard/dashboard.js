import React, {useEffect, useState} from "react";
import './dashboard.css';
import logo from '../../assets/images/logo.jpeg';
import {Link} from "react-router-dom";
import AddressbookService from "../../service/addressbook-service";
import Contact from "./contacts";


function Dashboard() {

    const [contactArray, setContact] = useState([]);

    useEffect(() => {
        getAllContacts();
    }, []);

    const getAllContacts = () => {
        AddressbookService.getContacts().then((response) => {
            const allContacts = response.data.data;
            setContact(allContacts);
        }).catch((error) => {
            alert(error);
        })
    }

    function sortByCity() {
        AddressbookService.sortByCity().then((response) => {
            console.log("click");
            const allContacts = response.data.data;
            setContact(allContacts);
        })
    }

    function sortByState() {
        AddressbookService.sortByState().then((response) => {
            const allContacts = response.data.data;
            setContact(allContacts);
        })
    }

    return (
        <>
            <header className="header-content header">
                <div className="logo-content">
                    <img src={logo} alt="logo"/>
                    <div>
                        <span className="addressBook-text">Address</span><br/>
                        <span className="addressBook-text addressBook-book">Book</span>
                    </div>
                </div>
            </header>
            <div className="main-content">
                <div className="header-content person-header">
                    <div className="person-detail-text">
                        Person Details
                        <div className="person-count">{contactArray.length}</div>
                    </div>
                    <Link to="/form" className="add-button">
                        <div>Add Person</div>
                    </Link>
                </div>
                <div className="table-main">
                    {/*<table id="table-display" className="table">*/}
                    {/*    <tr key={-1}>*/}
                    {/*        <th>Full Name</th>*/}
                    {/*        <th>Address</th>*/}
                    {/*        <th onClick={() => sortByCity()}>City</th>*/}
                    {/*        <th onClick={() => sortByState()}>State</th>*/}
                    {/*        <th>Zip Code</th>*/}
                    {/*        <th>Phone Number</th>*/}
                    {/*        <th>Actions</th>*/}
                    {/*    </tr>*/}


                    {/*    <Contact contactArray={contactArray}/>*/}
                    {/*</table>*/}
                    <Contact contactArray={contactArray}/>
                </div>
            </div>
        </>
    );
}
export default Dashboard;