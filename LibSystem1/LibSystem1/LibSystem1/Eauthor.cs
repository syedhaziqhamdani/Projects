using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Configuration;
using System.Data;
using System.Data.SqlClient;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace LibSystem1
{
    public partial class Eauthor : Form
    {

        SqlDataAdapter adpt;
        DataSet ds;

        public Eauthor()
        {
            InitializeComponent();
        }

        private void Eauthor_Load(object sender, EventArgs e)
        {
            try
            {
                SqlConnection conn = new SqlConnection();
                conn.ConnectionString = "Data Source=PC\\SQLExpress;Initial Catalog=LIBRARYMANAGEMENTSYSTEM;Integrated Security=True";


                adpt = new SqlDataAdapter("select * from AUTHORS", conn);

                ds = new DataSet();
                adpt.Fill(ds, "AUTHORS");

                dataGridView1.DataSource = ds.Tables[0];
            }
            catch (Exception ex)
            {


            }

        }

        private void btnupdate_Click(object sender, EventArgs e)
        {
            try
            {

                SqlCommandBuilder cmdb = new SqlCommandBuilder(adpt);

                adpt.Update(ds, "AUTHORS");

            }
            catch (Exception ex)
            {



            }
        }
    }
}
