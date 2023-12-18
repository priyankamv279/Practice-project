// Object to manage budget and expenses
const budgetManager = {
    annualBudget: 10000, //initial annual budget
    totalExpenses: 0,

    addDeal: function(name, vendor, expenses) {
        // Simulate asynchronous operation with a promise
        return new Promise((resolve, reject) => {
            // Delay to simulate async operation (e.g., fetching data)
            setTimeout(() => {
                this.totalExpenses += expenses;
                this.updateBudgetInfo();
                resolve('Deal added successfully!');
            }, 1000); // Simulated delay of 1 second
        });
    },

    updateBudgetInfo: function() {
        // Function to update budget-related information on the interface
        const remainingBudget = this.annualBudget - this.totalExpenses;
        document.getElementById('budgetInfo').innerHTML = `
            <h1>Budget Info</h1> 
            <h3>Finance Team:</h3>
            <p>Annual Budget: ${this.annualBudget}</p>
            <p>Remaining Budget: ${remainingBudget}</p>
            <p>Total Expenses: ${this.totalExpenses}</p>
        `;
    }
};

// Event listener for form submission
document.getElementById('dealForm').addEventListener('submit', async function(event) {
    event.preventDefault();
    const dealName = document.getElementById('dealName').value;
    const vendor = document.getElementById('vendor').value;
    const expenses = parseFloat(document.getElementById('expenses').value);

    // Check if expenses are valid and add the deal
    if (!isNaN(expenses) && expenses > 0) {
        try {
            const message = await budgetManager.addDeal(dealName, vendor, expenses);
            alert(message); // Show success message
        } catch (error) {
            alert('Failed to add deal! Please try again.'); // Show error message
        }
    } else {
        alert('Please enter valid expenses.');
    }
});
